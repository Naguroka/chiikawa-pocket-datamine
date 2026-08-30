package androidx.core.transition;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001aÉ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\r\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u000f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0011\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "onStart", "onCancel", com.ironsource.y8.h.u0, com.ironsource.y8.h.t0, "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TransitionKt {
    public static /* synthetic */ android.transition.Transition.TransitionListener addListener$default(android.transition.Transition transition, kotlin.jvm.functions.Function1 onEnd, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function2, kotlin.jvm.functions.Function1 onResume, kotlin.jvm.functions.Function1 onPause, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onEnd = new kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.transition.Transition it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.transition.Transition it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 onStart = function1;
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.transition.Transition it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function1 onCancel = function2;
        if ((i & 8) != 0) {
            onResume = new kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.transition.Transition it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 16) != 0) {
            onPause = new kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.5
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.transition.Transition it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.transition.Transition transition2) {
                    invoke2(transition2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStart, "onStart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResume, "onResume");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPause, "onPause");
        androidx.core.transition.TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new androidx.core.transition.TransitionKt$addListener$listener$1(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final android.transition.Transition.TransitionListener addListener(android.transition.Transition transition, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> onEnd, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> onStart, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> onCancel, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> onResume, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> onPause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStart, "onStart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResume, "onResume");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPause, "onPause");
        androidx.core.transition.TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new androidx.core.transition.TransitionKt$addListener$listener$1(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final android.transition.Transition.TransitionListener doOnEnd(android.transition.Transition transition, final kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.transition.Transition.TransitionListener transitionListener = new android.transition.Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
                action.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final android.transition.Transition.TransitionListener doOnStart(android.transition.Transition transition, final kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.transition.Transition.TransitionListener transitionListener = new android.transition.Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
                action.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final android.transition.Transition.TransitionListener doOnCancel(android.transition.Transition transition, final kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.transition.Transition.TransitionListener transitionListener = new android.transition.Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
                action.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final android.transition.Transition.TransitionListener doOnResume(android.transition.Transition transition, final kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.transition.Transition.TransitionListener transitionListener = new android.transition.Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
                action.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final android.transition.Transition.TransitionListener doOnPause(android.transition.Transition transition, final kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.transition.Transition.TransitionListener transitionListener = new android.transition.Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(android.transition.Transition transition2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition2, "transition");
                action.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
