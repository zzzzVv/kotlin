/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.decompiler.navigation;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/decompiler/navigation/usercode")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class NavigateToDecompiledLibraryTestGenerated extends AbstractNavigateToDecompiledLibraryTest {
    public void testAllFilesPresentInUsercode() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/decompiler/navigation/usercode"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("ClassObject.kt")
    public void testClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/ClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("Constructor.kt")
    public void testConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/Constructor.kt");
        doTest(fileName);
    }

    @TestMetadata("Enum.kt")
    public void testEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/Enum.kt");
        doTest(fileName);
    }

    @TestMetadata("ExtensionFunction.kt")
    public void testExtensionFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/ExtensionFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("ExtensionProperty.kt")
    public void testExtensionProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/ExtensionProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunctionWithExplicitlyDeclaredTypeArguments.kt")
    public void testGenericFunctionWithExplicitlyDeclaredTypeArguments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/GenericFunctionWithExplicitlyDeclaredTypeArguments.kt");
        doTest(fileName);
    }

    @TestMetadata("GenericFunctionWithInferredTypeArguments.kt")
    public void testGenericFunctionWithInferredTypeArguments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/GenericFunctionWithInferredTypeArguments.kt");
        doTest(fileName);
    }

    @TestMetadata("GlobalFunction.kt")
    public void testGlobalFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/GlobalFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("GlobalProperty.kt")
    public void testGlobalProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/GlobalProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedObject.kt")
    public void testNamedObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/NamedObject.kt");
        doTest(fileName);
    }

    @TestMetadata("OverloadedFunWithTypeParam.kt")
    public void testOverloadedFunWithTypeParam() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/OverloadedFunWithTypeParam.kt");
        doTest(fileName);
    }

    @TestMetadata("Property.kt")
    public void testProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/Property.kt");
        doTest(fileName);
    }

    @TestMetadata("SameNameInDifferentSources.kt")
    public void testSameNameInDifferentSources() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/SameNameInDifferentSources.kt");
        doTest(fileName);
    }

    @TestMetadata("TypeAlias.kt")
    public void testTypeAlias() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/TypeAlias.kt");
        doTest(fileName);
    }

    @TestMetadata("TypeWithSameShortName.kt")
    public void testTypeWithSameShortName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/decompiler/navigation/usercode/TypeWithSameShortName.kt");
        doTest(fileName);
    }
}
