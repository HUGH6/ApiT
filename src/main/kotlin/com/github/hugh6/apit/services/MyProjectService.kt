package com.github.hugh6.apit.services

import com.intellij.openapi.project.Project
import com.github.hugh6.apit.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
