package com.github.he36251.riderblazorcommentsindentation.services

import com.github.he36251.riderblazorcommentsindentation.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
