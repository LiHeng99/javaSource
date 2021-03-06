/*******************************************************************************
 * Copyright (c) 2017, 2021 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package java.lang.invoke;

import java.lang.reflect.Method;
import sun.invoke.util.Wrapper;

/*
 * Stub class to compile OpenJDK j.l.i.MethodHandleImpl
 */
class LambdaForm {

	LambdaForm(String str, int num1, Name[] names, int num2) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	LambdaForm(String str, int num, Name[] names) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	LambdaForm(String str, int num, Name[] names, boolean flag) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	static class NamedFunction {
		NamedFunction(MethodHandle mh) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		NamedFunction(MethodType mt) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		NamedFunction(MemberName mn, MethodHandle mh) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		NamedFunction(Method m) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		MethodHandle resolvedHandle() {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		MethodHandle resolve() {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
	}
	
	enum BasicType {
		L_TYPE,
		I_TYPE,
		J_TYPE,
		F_TYPE,
		D_TYPE,
		V_TYPE;

		static BasicType basicType(Class<?> cls) {
			/* Wrapper.forPrimitiveType throws an IllegalArgumentException for
			 * non-primitive types (L_TYPE).
			 */
			Wrapper wrapper = Wrapper.forPrimitiveType(cls);
			BasicType basicType = null;
			if (wrapper != null) {
				char basicTypeChar = wrapper.basicTypeChar();
				if ((basicTypeChar == 'C') || (basicTypeChar == 'B') || (basicTypeChar == 'Z')
					|| (basicTypeChar == 'I') || (basicTypeChar == 'S')
				) {
					basicType = I_TYPE;
				} else if (basicTypeChar == 'J') {
					basicType = J_TYPE;
				} else if (basicTypeChar == 'F') {
					basicType = F_TYPE;
				} else if (basicTypeChar == 'D') {
					basicType = D_TYPE;
				} else if (basicTypeChar == 'V') {
					basicType = V_TYPE;
				} else {
					throw new InternalError("Unknown basic type char: " + basicTypeChar);
				}
			}
			return basicType;
		}
	}

	@interface Hidden {
	}

	static final class Name {
		Name(MethodHandle mh, Object... objs) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		Name(MethodType mt, Object... objs) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		Name(NamedFunction nf, Object... objs) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		Name withConstraint(Object obj) {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
	}

	static LambdaForm.Name[] arguments(int num, MethodType mt) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	static NamedFunction constantZero(BasicType bt) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	void compileToBytecode() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	LambdaFormEditor editor() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

}
