package com.redevstudios.cineone.cineone.ui.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.redevstudios.cineone.cineone.R;
import com.redevstudios.cineone.cineone.model.MovieReview;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReviewViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.movie_review_username)
    TextView mMovieReviewAuthor;
    @BindView(R.id.movie_review_content)
    TextView mMovieReviewContent;

    public ReviewViewHolder(final View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final MovieReview mMovieReview) {
        mMovieReviewAuthor.setText(mMovieReview.getAuthor());
        mMovieReviewContent.setText(mMovieReview.getContent());
    }
}
