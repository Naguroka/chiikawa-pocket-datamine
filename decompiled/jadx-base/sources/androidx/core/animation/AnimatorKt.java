package androidx.core.animation;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a¤\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001aV\u0010\f\u001a\u00020\r*\u00020\u00022#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007\u001a5\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a/\u0010\u0013\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007\u001a5\u0010\u0014\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a/\u0010\u0015\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0007\u001a5\u0010\u0016\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "", "onStart", "onCancel", "onRepeat", "addPauseListener", "Landroid/animation/Animator$AnimatorPauseListener;", com.ironsource.y8.h.u0, com.ironsource.y8.h.t0, "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnRepeat", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AnimatorKt {
    public static final android.animation.Animator.AnimatorPauseListener doOnResume(android.animation.Animator animator, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return addPauseListener$default(animator, action, null, 2, null);
    }

    public static final android.animation.Animator.AnimatorPauseListener doOnPause(android.animation.Animator animator, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return addPauseListener$default(animator, null, action, 1, null);
    }

    public static /* synthetic */ android.animation.Animator.AnimatorListener addListener$default(android.animation.Animator animator, kotlin.jvm.functions.Function1 onEnd, kotlin.jvm.functions.Function1 onStart, kotlin.jvm.functions.Function1 onCancel, kotlin.jvm.functions.Function1 onRepeat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onEnd = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onStart = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            onCancel = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            onRepeat = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt.addListener.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStart, "onStart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRepeat, "onRepeat");
        androidx.core.animation.AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new androidx.core.animation.AnimatorKt$addListener$listener$1(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final android.animation.Animator.AnimatorListener addListener(android.animation.Animator animator, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onEnd, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onStart, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onCancel, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onRepeat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStart, "onStart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRepeat, "onRepeat");
        androidx.core.animation.AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new androidx.core.animation.AnimatorKt$addListener$listener$1(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ android.animation.Animator.AnimatorPauseListener addPauseListener$default(android.animation.Animator animator, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt.addPauseListener.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function2 = new kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit>() { // from class: androidx.core.animation.AnimatorKt.addPauseListener.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.animation.Animator it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.animation.Animator animator2) {
                    invoke2(animator2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return addPauseListener(animator, function1, function2);
    }

    public static final android.animation.Animator.AnimatorPauseListener addPauseListener(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onResume, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> onPause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResume, "onResume");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPause, "onPause");
        android.animation.Animator.AnimatorPauseListener animatorPauseListener = new android.animation.Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
                onPause.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
                onResume.invoke(animator2);
            }
        };
        androidx.core.animation.Api19Impl.addPauseListener(animator, animatorPauseListener);
        return animatorPauseListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnEnd(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
                action.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnStart(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
                action.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnCancel(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
                action.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final android.animation.Animator.AnimatorListener doOnRepeat(android.animation.Animator animator, final kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.animation.Animator.AnimatorListener animatorListener = new android.animation.Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animator2, "animator");
                action.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
