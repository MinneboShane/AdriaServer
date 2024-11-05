package be.howest.adria.infrastructure.persistence;

import be.howest.adria.infrastructure.persistence.migrations.Migration;
import be.howest.adria.infrastructure.persistence.migrations.Seeder;
import be.howest.adria.infrastructure.persistence.shared.utils.JdbcConnection;
import be.howest.adria.infrastructure.shared.utils.Config;
import java.util.logging.Logger;
import java.util.logging.Level;

public class PersistenceModule {
  private static final Logger LOGGER = Logger.getLogger(PersistenceModule.class.getName());
  private static Config config;

  public static void init(Config cfg) {
    config = cfg;
    JdbcConnection.initialize(config.readSetting("sqlite.connectionString"));
    buildRepositories();
    migrateDatabase();
    seedDatabase();
  }

  private static void buildRepositories() {
    // Initialize here the repositories.
  }

  private static void migrateDatabase() {
    migrateReadDatabase();
  }

  private static void migrateReadDatabase() {
    String migrationFilePath = config.readSetting("sqlite.migration.file");
    LOGGER.log(Level.INFO, "Migrating database with file {0}", migrationFilePath);
    Migration.migrate(migrationFilePath, JdbcConnection.instance());
  }

  private static void seedDatabase() {
    Seeder seeder = new Seeder(
      // Pass the repositories here.
    );

    seeder.seed();
  }

  private PersistenceModule() {
    throw new IllegalStateException("Utility class");
  }
}
