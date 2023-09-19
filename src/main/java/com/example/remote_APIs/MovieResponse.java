package com.example.remote_APIs;

public class MovieResponse {
    private String original_title;

    private int revenue;

    private String original_language;

    private String imdb_id;

    public MovieResponse() {
    }

    public MovieResponse(String original_title, int revenue, String original_language, String imdb_id) {
        this.original_title = original_title;
        this.revenue = revenue;
        this.original_language = original_language;
        this.imdb_id = imdb_id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }
}
