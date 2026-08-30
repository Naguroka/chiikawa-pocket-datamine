package com.unity3d.services.core.domain;

/* JADX INFO: compiled from: ResultExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u000e\b\u0000\u0010\u0001\u0018\u0001*\u00060\u0002j\u0002`\u0003*\u0006\u0012\u0002\b\u00030\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a)\u0010\u0006\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001\u0018\u0001*\u00060\u0002j\u0002`\u0003*\u0006\u0012\u0002\b\u00030\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u0004ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u0016\u0010\n\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u0004ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"getCustomExceptionOrNull", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Exception;", "getCustomExceptionOrThrow", "getInitializationExceptionOrNull", "Lcom/unity3d/services/core/domain/task/InitializationException;", "(Ljava/lang/Object;)Lcom/unity3d/services/core/domain/task/InitializationException;", "getInitializationExceptionOrThrow", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ResultExtensionsKt {
    public static final /* synthetic */ <E extends java.lang.Exception> E getCustomExceptionOrNull(java.lang.Object obj) {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(obj);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (thM1304exceptionOrNullimpl instanceof java.lang.Exception) {
            return (E) thM1304exceptionOrNullimpl;
        }
        return null;
    }

    public static final /* synthetic */ <E extends java.lang.Exception> E getCustomExceptionOrThrow(java.lang.Object obj) {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(obj);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (thM1304exceptionOrNullimpl instanceof java.lang.Exception) {
            return (E) thM1304exceptionOrNullimpl;
        }
        throw new java.lang.IllegalArgumentException("Wrong Exception type found");
    }

    public static final com.unity3d.services.core.domain.task.InitializationException getInitializationExceptionOrNull(java.lang.Object obj) {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(obj);
        if (thM1304exceptionOrNullimpl instanceof com.unity3d.services.core.domain.task.InitializationException) {
            return (com.unity3d.services.core.domain.task.InitializationException) thM1304exceptionOrNullimpl;
        }
        return null;
    }

    public static final com.unity3d.services.core.domain.task.InitializationException getInitializationExceptionOrThrow(java.lang.Object obj) {
        java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(obj);
        if (thM1304exceptionOrNullimpl instanceof com.unity3d.services.core.domain.task.InitializationException) {
            return (com.unity3d.services.core.domain.task.InitializationException) thM1304exceptionOrNullimpl;
        }
        throw new java.lang.IllegalArgumentException("Wrong Exception type found");
    }
}
