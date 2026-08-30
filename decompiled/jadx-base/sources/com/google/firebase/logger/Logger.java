package com.google.firebase.logger;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b&\u0018\u0000 %2\u00020\u0001:\u0004$%&'B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ9\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0002\u0010 J;\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0012\b\u0002\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010 J9\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\"\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010#\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/google/firebase/logger/Logger;", "", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getMinLevel", "()Lcom/google/firebase/logger/Logger$Level;", "setMinLevel", "(Lcom/google/firebase/logger/Logger$Level;)V", "getTag", "()Ljava/lang/String;", "debug", "", "format", "args", "", "throwable", "", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "error", "info", "log", "level", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "logIfAble", "verbose", "warn", "AndroidLogger", "Companion", "FakeLogger", "Level", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.logger.Logger.Companion INSTANCE = new com.google.firebase.logger.Logger.Companion(null);
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.firebase.logger.Logger> loggers = new java.util.concurrent.ConcurrentHashMap<>();
    private boolean enabled;
    private com.google.firebase.logger.Logger.Level minLevel;
    private final java.lang.String tag;

    public /* synthetic */ Logger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, level);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.firebase.logger.Logger getLogger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
        return INSTANCE.getLogger(str, z, level);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.firebase.logger.Logger.FakeLogger setupFakeLogger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
        return INSTANCE.setupFakeLogger(str, z, level);
    }

    public final int debug(java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    public final int debug(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    public final int error(java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    public final int error(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    public final int info(java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public final int info(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    public abstract int log(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable);

    public final int verbose(java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    public final int verbose(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    public final int warn(java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    public final int warn(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    private Logger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
        this.tag = str;
        this.enabled = z;
        this.minLevel = level;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final com.google.firebase.logger.Logger.Level getMinLevel() {
        return this.minLevel;
    }

    public final void setMinLevel(com.google.firebase.logger.Logger.Level level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.minLevel = level;
    }

    public static /* synthetic */ int verbose$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public final int verbose(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(com.google.firebase.logger.Logger.Level.VERBOSE, format, args, throwable);
    }

    public static /* synthetic */ int verbose$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public final int verbose(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.VERBOSE, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int debug$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public final int debug(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(com.google.firebase.logger.Logger.Level.DEBUG, format, args, throwable);
    }

    public static /* synthetic */ int debug$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public final int debug(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.DEBUG, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int info$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    public final int info(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(com.google.firebase.logger.Logger.Level.INFO, format, args, throwable);
    }

    public static /* synthetic */ int info$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public final int info(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.INFO, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int warn$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int warn(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(com.google.firebase.logger.Logger.Level.WARN, format, args, throwable);
    }

    public static /* synthetic */ int warn$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public final int warn(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.WARN, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int error$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    public final int error(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        return logIfAble(com.google.firebase.logger.Logger.Level.ERROR, format, args, throwable);
    }

    public static /* synthetic */ int error$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public final int error(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.ERROR, msg, null, throwable, 4, null);
    }

    static /* synthetic */ int logIfAble$default(com.google.firebase.logger.Logger logger, com.google.firebase.logger.Logger.Level level, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i & 4) != 0) {
            objArr = new java.lang.Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    private final int logIfAble(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        if (!this.enabled || (this.minLevel.getPriority() > level.getPriority() && !android.util.Log.isLoggable(this.tag, level.getPriority()))) {
            return 0;
        }
        return log(level, format, args, throwable);
    }

    /* JADX INFO: compiled from: Logger.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ9\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/logger/Logger$AndroidLogger;", "Lcom/google/firebase/logger/Logger;", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "log", "", "level", "format", "args", "", "", "throwable", "", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AndroidLogger extends com.google.firebase.logger.Logger {

        /* JADX INFO: compiled from: Logger.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.google.firebase.logger.Logger.Level.values().length];
                try {
                    iArr[com.google.firebase.logger.Logger.Level.VERBOSE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.DEBUG.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.INFO.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.WARN.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.ERROR.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(java.lang.String tag, boolean z, com.google.firebase.logger.Logger.Level minLevel) {
            super(tag, z, minLevel, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            if (!(args.length == 0)) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(args, args.length);
                format = java.lang.String.format(format, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            }
            int i = com.google.firebase.logger.Logger.AndroidLogger.WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                java.lang.String tag = getTag();
                return throwable != null ? android.util.Log.v(tag, format, throwable) : android.util.Log.v(tag, format);
            }
            if (i == 2) {
                java.lang.String tag2 = getTag();
                return throwable != null ? android.util.Log.d(tag2, format, throwable) : android.util.Log.d(tag2, format);
            }
            if (i == 3) {
                java.lang.String tag3 = getTag();
                return throwable != null ? android.util.Log.i(tag3, format, throwable) : android.util.Log.i(tag3, format);
            }
            if (i == 4) {
                java.lang.String tag4 = getTag();
                return throwable != null ? android.util.Log.w(tag4, format, throwable) : android.util.Log.w(tag4, format);
            }
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String tag5 = getTag();
            return throwable != null ? android.util.Log.e(tag5, format, throwable) : android.util.Log.e(tag5, format);
        }
    }

    /* JADX INFO: compiled from: Logger.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H\u0007J\u001c\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0011H\u0007J9\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010\u001bJ9\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001dR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "record", "", "clearLogMessages", "", "hasLogMessage", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "hasLogMessageThat", "predicate", "Lkotlin/Function1;", "log", "", "level", "format", "args", "", "", "throwable", "", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "toLogMessage", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/String;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FakeLogger extends com.google.firebase.logger.Logger {
        private final java.util.List<java.lang.String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(java.lang.String tag, boolean z, com.google.firebase.logger.Logger.Level minLevel) {
            super(tag, z, minLevel, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            this.record = new java.util.ArrayList();
        }

        @Override // com.google.firebase.logger.Logger
        public int log(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            java.lang.String logMessage = toLogMessage(level, format, args, throwable);
            java.lang.System.out.println((java.lang.Object) ("Log: " + logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }

        public final void clearLogMessages() {
            this.record.clear();
        }

        public final boolean hasLogMessage(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            java.util.List<java.lang.String> list = this.record;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) it.next(), (java.lang.CharSequence) message, false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean hasLogMessageThat(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> predicate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
            java.util.List<java.lang.String> list = this.record;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        private final java.lang.String toLogMessage(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
            java.lang.String string;
            if (!(args.length == 0)) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(args, args.length);
                format = java.lang.String.format(format, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            }
            return (throwable == null || (string = new java.lang.StringBuilder().append(level).append(' ').append(format).append(' ').append(android.util.Log.getStackTraceString(throwable)).toString()) == null) ? level + ' ' + format : string;
        }
    }

    /* JADX INFO: compiled from: Logger.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;II)V", "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i) {
            this.priority = i;
        }

        /* JADX INFO: renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }
    }

    /* JADX INFO: compiled from: Logger.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "()V", com.json.y3.f3571a, "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/google/firebase/logger/Logger;", "getLogger", "tag", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "setupFakeLogger", "Lcom/google/firebase/logger/Logger$FakeLogger;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ com.google.firebase.logger.Logger getLogger$default(com.google.firebase.logger.Logger.Companion companion, java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = com.google.firebase.logger.Logger.Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.firebase.logger.Logger getLogger(java.lang.String tag, boolean enabled, com.google.firebase.logger.Logger.Level minLevel) {
            java.lang.Object objPutIfAbsent;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.google.firebase.logger.Logger.loggers;
            com.google.firebase.logger.Logger.AndroidLogger androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new com.google.firebase.logger.Logger.AndroidLogger(tag, enabled, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidLogger, "loggers.getOrPut(tag) { …tag, enabled, minLevel) }");
            return (com.google.firebase.logger.Logger) androidLogger;
        }

        public static /* synthetic */ com.google.firebase.logger.Logger.FakeLogger setupFakeLogger$default(com.google.firebase.logger.Logger.Companion companion, java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = com.google.firebase.logger.Logger.Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.firebase.logger.Logger.FakeLogger setupFakeLogger(java.lang.String tag, boolean enabled, com.google.firebase.logger.Logger.Level minLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            com.google.firebase.logger.Logger.FakeLogger fakeLogger = new com.google.firebase.logger.Logger.FakeLogger(tag, enabled, minLevel);
            com.google.firebase.logger.Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }
    }
}
