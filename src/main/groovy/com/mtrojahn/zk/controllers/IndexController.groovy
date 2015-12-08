package com.mtrojahn.zk.controllers

import org.zkoss.bind.annotation.Init
import org.zkoss.zk.ui.select.annotation.VariableResolver
import org.zkoss.zk.ui.select.annotation.WireVariable
import org.zkoss.zkplus.spring.DelegatingVariableResolver

@VariableResolver(DelegatingVariableResolver.class)
class IndexController {

    @WireVariable("simpleBean")
    def simpleBean

    def message

    @Init
    def init() {
        message = simpleBean.echo("Hello World!");
    }
}
