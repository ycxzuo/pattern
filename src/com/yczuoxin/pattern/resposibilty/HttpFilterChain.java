package com.yczuoxin.pattern.resposibilty;

import java.util.List;

public class HttpFilterChain implements FilterChain {

    private final List<Filter> filters;

    private int currentIndex = 0;

    public HttpFilterChain(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (currentIndex < filters.size()) {
            filters.get(currentIndex++).filter(request, response, this);
        }
    }
}
