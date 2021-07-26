package com.yczuoxin.pattern.resposibilty;

import java.util.ArrayList;
import java.util.List;

public class FilterChainTest {
    public static void main(String[] args) {
        List<Filter> filters = new ArrayList<>();
        filters.add(new MessageFilter());
        filters.add(new NameFilter());
        FilterChain filterChain = new HttpFilterChain(filters);
        Request request = new Request();
        Response response = new Response();
        request.str = "request";
        response.str = "response";
        filterChain.doFilter(request, response);
    }
}
