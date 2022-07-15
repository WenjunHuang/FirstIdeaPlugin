package com.github.wenjunhuang.restTools.request.highlighting

import com.intellij.openapi.editor.colors.EditorColorsScheme
import com.intellij.openapi.editor.highlighter.EditorHighlighter
import com.intellij.openapi.fileTypes.{EditorHighlighterProvider, FileType}
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class RESTRequestHighlighterProvider extends EditorHighlighterProvider:
  override def getEditorHighlighter(project: Project, fileType: FileType, virtualFile: VirtualFile, colors: EditorColorsScheme): EditorHighlighter =
    RESTRequestHighlighter(colors,project,virtualFile)
end RESTRequestHighlighterProvider
