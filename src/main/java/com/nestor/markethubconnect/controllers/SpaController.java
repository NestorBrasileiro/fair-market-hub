package com.nestor.markethubconnect.controllers;

@Controller
public class SpaController {

    @GetMapping(value = { "/{path:[^\\.]*}", "/**/{path:[^\\.]*}" })
    public String redirectSpaRoutes() {
        // Redireciona quaisquer rotas (GET) não mapeadas para o index.html da SPA
        return "forward:/index.html";
    }
}
