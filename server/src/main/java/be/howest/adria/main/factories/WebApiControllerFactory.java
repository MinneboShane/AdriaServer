package be.howest.adria.main.factories;

import be.howest.adria.infrastructure.shared.contracts.Controller;
import be.howest.adria.infrastructure.webapi.shared.Request;
import io.vertx.ext.web.RoutingContext;

public class WebApiControllerFactory {
    private static final WebApiControllerFactory instance = new WebApiControllerFactory();

    public static WebApiControllerFactory instance() {
        return instance;
    }

    private WebApiControllerFactory() {}

    // This sonar smell will go away when you implement multiple controllers.
    public Controller<Request> createController(String operationId, RoutingContext ctx) {
        // This sonar smell will go away when you implement multiple controllers.
        switch (operationId) {
            case "myOperationIdinWebapi.yaml":
                // build and return the controller
            default:
                throw new IllegalArgumentException("Unknown operationId: " + operationId);
        }
    }
}
