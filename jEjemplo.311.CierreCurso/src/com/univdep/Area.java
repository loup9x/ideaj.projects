package com.univdep;

public class Area extends Figure {
    private int limit;
    private String figure;

    public Area() {
        limit = 0;
        figure = "";
    }

    public void setLimit(int value) {
        limit = value;
    }

    @Override
    public String drawing() {
        for(int n = 1;n <= limit; n++) {
            for(int m = 1; m <= n; m++)
                figure += "* ";
            figure += "\n";
        }
        return figure;
    }
}
