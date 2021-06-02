package com.github.tenglong3158.plugindemo.services

import com.github.tenglong3158.plugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
