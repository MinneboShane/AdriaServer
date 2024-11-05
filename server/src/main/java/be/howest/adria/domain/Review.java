package be.howest.adria.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Review {
    private UUID reviewId;
    private UUID productId;
    private UUID userId;
    private int rating;
    private String reviewText;
    private Date reviewDate;

    public Review( UUID reviewId, UUID productId, UUID userId, int rating, String reviewText, Date reviewDate ) {
        this.reviewId = reviewId;
        this.productId = productId;
        this.userId = userId;
        this.rating = rating;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
    }

    public UUID getReviewId() {
        return reviewId;
    }

    public void setReviewId( UUID reviewId ) {
        this.reviewId = reviewId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId( UUID productId ) {
        this.productId = productId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId( UUID userId ) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating( int rating ) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText( String reviewText ) {
        this.reviewText = reviewText;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate( Date reviewDate ) {
        this.reviewDate = reviewDate;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Review review = ( Review ) o;
        return reviewId == review.reviewId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reviewId);
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", productId=" + productId +
                ", userId=" + userId +
                ", rating=" + rating +
                ", reviewText='" + reviewText + '\'' +
                ", reviewDate=" + reviewDate +
                '}';
    }
}
