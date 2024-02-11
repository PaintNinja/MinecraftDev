/*
 * Minecraft Development for IntelliJ
 *
 * https://mcdev.io/
 *
 * Copyright (C) 2024 minecraft-dev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, version 3.0 only.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.demonwav.mcdev.platform.mixin.expression.reference

import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement

class MEDefinitionFindUsagesProvider : FindUsagesProvider {
    override fun canFindUsagesFor(element: PsiElement) = MEReferenceUtil.isDefinitionId(element)

    override fun getHelpId(psiElement: PsiElement): String? = null

    override fun getType(element: PsiElement) = "definition id"

    override fun getDescriptiveName(element: PsiElement) = "Definition ID"

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String = element.text
}
