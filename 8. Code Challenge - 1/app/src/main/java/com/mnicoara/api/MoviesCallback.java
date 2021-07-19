package com.mnicoara.api;

import java.util.List;

public interface MoviesCallback {
    void onSuccess(List<Movie> movies);

    void onFailure(Throwable throwable);
}
