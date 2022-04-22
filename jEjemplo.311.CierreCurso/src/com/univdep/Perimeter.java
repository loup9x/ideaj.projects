package com.univdep;

public class Perimeter extends Figure {
    private int limit;
    private String figure;

    public Perimeter() {
        limit = 0;
        figure = "";
    }

    public void setLimit(int value) {
        limit = value;
    }

    @Override
    public String drawing() {
        for(int n = 1;n <= limit; n++) {
            for(int m = 1; m <= n; m++) {
                if( m == 1 || n == limit || n == m)
                    figure += "* ";
                else
                    figure += "  ";
            }
            figure += "\n";
        }
        return figure;
    }
}
