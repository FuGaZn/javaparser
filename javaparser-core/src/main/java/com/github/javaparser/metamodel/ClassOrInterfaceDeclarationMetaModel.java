/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2019 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.javaparser.metamodel;

import java.util.Optional;

public class ClassOrInterfaceDeclarationMetaModel extends TypeDeclarationMetaModel {

    ClassOrInterfaceDeclarationMetaModel(Optional<BaseNodeMetaModel> superBaseNodeMetaModel) {
        super(superBaseNodeMetaModel, com.github.javaparser.ast.body.ClassOrInterfaceDeclaration.class, "ClassOrInterfaceDeclaration", "com.github.javaparser.ast.body", false, false);
    }

    public PropertyMetaModel extendedTypesPropertyMetaModel;

    public PropertyMetaModel implementedTypesPropertyMetaModel;

    public PropertyMetaModel isInterfacePropertyMetaModel;

    public PropertyMetaModel typeParametersPropertyMetaModel;
}
