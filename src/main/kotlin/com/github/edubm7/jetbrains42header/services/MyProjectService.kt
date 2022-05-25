package com.github.edubm7.jetbrains42header.services

import com.intellij.openapi.project.Project
import com.github.edubm7.jetbrains42header.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
