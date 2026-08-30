package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
final class FuturesGetChecked {
    private static final com.google.common.collect.Ordering<java.util.List<java.lang.Class<?>>> ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST;
    private static final com.google.common.collect.Ordering<java.lang.reflect.Constructor<?>> WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM;

    interface GetCheckedTypeValidator {
        void validateClass(java.lang.Class<? extends java.lang.Exception> exceptionClass);
    }

    @com.google.common.util.concurrent.ParametricNullness
    static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls) throws java.lang.Exception {
        return (V) getChecked(bestGetCheckedTypeValidator(), future, cls);
    }

    @com.google.common.util.concurrent.ParametricNullness
    static <V, X extends java.lang.Exception> V getChecked(com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator validator, java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass) throws java.lang.Exception {
        validator.validateClass(exceptionClass);
        try {
            return future.get();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw newWithCause(exceptionClass, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowExceptionOrError(e2.getCause(), exceptionClass);
            throw new java.lang.AssertionError();
        }
    }

    @com.google.common.util.concurrent.ParametricNullness
    static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.Exception {
        bestGetCheckedTypeValidator().validateClass(exceptionClass);
        try {
            return future.get(timeout, unit);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw newWithCause(exceptionClass, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowExceptionOrError(e2.getCause(), exceptionClass);
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e3) {
            throw newWithCause(exceptionClass, e3);
        }
    }

    private static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator bestGetCheckedTypeValidator() {
        return com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.BEST_VALIDATOR;
    }

    static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator weakSetValidator() {
        return com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    static class GetCheckedTypeValidatorHolder {
        static final com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator BEST_VALIDATOR = getBestValidator();

        GetCheckedTypeValidatorHolder() {
        }

        enum WeakSetValidator implements com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator {
            INSTANCE;

            private static final java.util.Set<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> validClasses = new java.util.concurrent.CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(java.lang.Class<? extends java.lang.Exception> exceptionClass) {
                java.util.Iterator<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> it = validClasses.iterator();
                while (it.hasNext()) {
                    if (exceptionClass.equals(it.next().get())) {
                        return;
                    }
                }
                com.google.common.util.concurrent.FuturesGetChecked.checkExceptionClassValidity(exceptionClass);
                java.util.Set<java.lang.ref.WeakReference<java.lang.Class<? extends java.lang.Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new java.lang.ref.WeakReference<>(exceptionClass));
            }
        }

        static com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator getBestValidator() {
            return com.google.common.util.concurrent.FuturesGetChecked.weakSetValidator();
        }
    }

    private static <X extends java.lang.Exception> void wrapAndThrowExceptionOrError(java.lang.Throwable cause, java.lang.Class<X> exceptionClass) throws java.lang.Exception {
        if (cause instanceof java.lang.Error) {
            throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) cause);
        }
        if (cause instanceof java.lang.RuntimeException) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(cause);
        }
        throw newWithCause(exceptionClass, cause);
    }

    private static boolean hasConstructorUsableByGetChecked(java.lang.Class<? extends java.lang.Exception> exceptionClass) {
        try {
            newWithCause(exceptionClass, new java.lang.Exception());
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static <X extends java.lang.Exception> X newWithCause(java.lang.Class<X> exceptionClass, java.lang.Throwable cause) {
        java.util.Iterator it = preferringStringsThenThrowables(java.util.Arrays.asList(exceptionClass.getConstructors())).iterator();
        while (it.hasNext()) {
            X x = (X) newFromConstructor((java.lang.reflect.Constructor) it.next(), cause);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(cause);
                }
                return x;
            }
        }
        throw new java.lang.IllegalArgumentException("No appropriate constructor for exception of type " + exceptionClass + " in response to chained exception", cause);
    }

    private static <X extends java.lang.Exception> java.util.List<java.lang.reflect.Constructor<X>> preferringStringsThenThrowables(java.util.List<java.lang.reflect.Constructor<X>> list) {
        return (java.util.List<java.lang.reflect.Constructor<X>>) WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM.sortedCopy(list);
    }

    static {
        com.google.common.collect.Ordering<java.util.List<java.lang.Class<?>>> orderingReverse = com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.FuturesGetChecked$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(((java.util.List) obj).contains(java.lang.String.class));
            }
        }).compound(com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.FuturesGetChecked$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(((java.util.List) obj).contains(java.lang.Throwable.class));
            }
        })).reverse();
        ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST = orderingReverse;
        WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM = orderingReverse.onResultOf(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.FuturesGetChecked$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.util.Arrays.asList(((java.lang.reflect.Constructor) obj).getParameterTypes());
            }
        });
    }

    @javax.annotation.CheckForNull
    private static <X> X newFromConstructor(java.lang.reflect.Constructor<X> constructor, java.lang.Throwable cause) {
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        java.lang.Object[] objArr = new java.lang.Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            java.lang.Class<?> cls = parameterTypes[i];
            if (cls.equals(java.lang.String.class)) {
                objArr[i] = cause.toString();
            } else {
                if (!cls.equals(java.lang.Throwable.class)) {
                    return null;
                }
                objArr[i] = cause;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    static boolean isCheckedException(java.lang.Class<? extends java.lang.Exception> type) {
        return !java.lang.RuntimeException.class.isAssignableFrom(type);
    }

    static void checkExceptionClassValidity(java.lang.Class<? extends java.lang.Exception> exceptionClass) {
        com.google.common.base.Preconditions.checkArgument(isCheckedException(exceptionClass), "Futures.getChecked exception type (%s) must not be a RuntimeException", exceptionClass);
        com.google.common.base.Preconditions.checkArgument(hasConstructorUsableByGetChecked(exceptionClass), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", exceptionClass);
    }

    private FuturesGetChecked() {
    }
}
