// This is a generated file. Not intended for manual editing.
package com.github.wenjunhuang.restTools.request.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.wenjunhuang.restTools.request.psi.RESTRequestElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.wenjunhuang.restTools.request.psi.*;

public class RESTRequestPropertyImpl extends ASTWrapperPsiElement implements RESTRequestProperty {

  public RESTRequestPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RESTRequestVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RESTRequestVisitor) accept((RESTRequestVisitor)visitor);
    else super.accept(visitor);
  }

}
