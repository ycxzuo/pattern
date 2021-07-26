package com.yczuoxin.pattern.resposibilty;

public class NameFilter implements Filter {
    @Override
    public void filter(Request request, Response response, FilterChain chain) {
        request.str += " -> name request ";
        chain.doFilter(request, response);
        response.str += " -> name response ";
    }
}
