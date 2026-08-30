package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class IntentSanitizer {
    private static final java.lang.String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private androidx.core.util.Predicate<java.lang.String> mAllowedActions;
    private androidx.core.util.Predicate<java.lang.String> mAllowedCategories;
    private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri;
    private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents;
    private androidx.core.util.Predicate<android.net.Uri> mAllowedData;
    private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras;
    private int mAllowedFlags;
    private androidx.core.util.Predicate<java.lang.String> mAllowedPackages;
    private androidx.core.util.Predicate<java.lang.String> mAllowedTypes;

    static /* synthetic */ void lambda$sanitizeByFiltering$0(java.lang.String str) {
    }

    private IntentSanitizer() {
    }

    public android.content.Intent sanitizeByFiltering(android.content.Intent intent) {
        return sanitize(intent, new androidx.core.util.Consumer() { // from class: androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.core.content.IntentSanitizer.lambda$sanitizeByFiltering$0((java.lang.String) obj);
            }
        });
    }

    public android.content.Intent sanitizeByThrowing(android.content.Intent intent) {
        return sanitize(intent, new androidx.core.util.Consumer() { // from class: androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.core.content.IntentSanitizer.lambda$sanitizeByThrowing$1((java.lang.String) obj);
            }
        });
    }

    static /* synthetic */ void lambda$sanitizeByThrowing$1(java.lang.String str) {
        throw new java.lang.SecurityException(str);
    }

    public android.content.Intent sanitize(android.content.Intent intent, androidx.core.util.Consumer<java.lang.String> consumer) {
        android.content.Intent intent2 = new android.content.Intent();
        android.content.ComponentName component = intent.getComponent();
        if ((this.mAllowAnyComponent && component == null) || this.mAllowedComponents.test(component)) {
            intent2.setComponent(component);
        } else {
            consumer.accept("Component is not allowed: " + component);
            intent2.setComponent(new android.content.ComponentName("android", "java.lang.Void"));
        }
        java.lang.String str = intent.getPackage();
        if (str == null || this.mAllowedPackages.test(str)) {
            intent2.setPackage(str);
        } else {
            consumer.accept("Package is not allowed: " + str);
        }
        int flags = this.mAllowedFlags | intent.getFlags();
        int i = this.mAllowedFlags;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            consumer.accept("The intent contains flags that are not allowed: 0x" + java.lang.Integer.toHexString(intent.getFlags() & (~this.mAllowedFlags)));
        }
        java.lang.String action = intent.getAction();
        if (action == null || this.mAllowedActions.test(action)) {
            intent2.setAction(action);
        } else {
            consumer.accept("Action is not allowed: " + action);
        }
        android.net.Uri data = intent.getData();
        if (data == null || this.mAllowedData.test(data)) {
            intent2.setData(data);
        } else {
            consumer.accept("Data is not allowed: " + data);
        }
        java.lang.String type = intent.getType();
        if (type == null || this.mAllowedTypes.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            consumer.accept("Type is not allowed: " + type);
        }
        java.util.Set<java.lang.String> categories = intent.getCategories();
        if (categories != null) {
            for (java.lang.String str2 : categories) {
                if (this.mAllowedCategories.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    consumer.accept("Category is not allowed: " + str2);
                }
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            for (java.lang.String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.mAllowedFlags & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (str3.equals(org.jacoco.core.runtime.AgentOptions.OUTPUT) && ((~this.mAllowedFlags) & 3) != 0) {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                } else {
                    java.lang.Object obj = extras.get(str3);
                    androidx.core.util.Predicate<java.lang.Object> predicate = this.mAllowedExtras.get(str3);
                    if (predicate != null && predicate.test(obj)) {
                        putExtra(intent2, str3, obj);
                    } else {
                        consumer.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    }
                }
            }
        }
        androidx.core.content.IntentSanitizer.Api16Impl.sanitizeClipData(intent, intent2, this.mAllowedClipData, this.mAllowClipDataText, this.mAllowedClipDataUri, consumer);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (this.mAllowIdentifier) {
                androidx.core.content.IntentSanitizer.Api29Impl.setIdentifier(intent2, androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(intent));
            } else if (androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(intent) != null) {
                consumer.accept("Identifier is not allowed: " + androidx.core.content.IntentSanitizer.Api29Impl.getIdentifier(intent));
            }
        }
        if (this.mAllowSelector) {
            androidx.core.content.IntentSanitizer.Api15Impl.setSelector(intent2, androidx.core.content.IntentSanitizer.Api15Impl.getSelector(intent));
        } else if (androidx.core.content.IntentSanitizer.Api15Impl.getSelector(intent) != null) {
            consumer.accept("Selector is not allowed: " + androidx.core.content.IntentSanitizer.Api15Impl.getSelector(intent));
        }
        if (this.mAllowSourceBounds) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            consumer.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    private void putExtra(android.content.Intent intent, java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof android.os.Parcelable) {
            intent.putExtra(str, (android.os.Parcelable) obj);
        } else if (obj instanceof android.os.Parcelable[]) {
            intent.putExtra(str, (android.os.Parcelable[]) obj);
        } else {
            if (obj instanceof java.io.Serializable) {
                intent.putExtra(str, (java.io.Serializable) obj);
                return;
            }
            throw new java.lang.IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private int mAllowedFlags;
        private androidx.core.util.Predicate<java.lang.String> mAllowedActions = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda11
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$0((java.lang.String) obj);
            }
        };
        private androidx.core.util.Predicate<android.net.Uri> mAllowedData = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda12
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$1((android.net.Uri) obj);
            }
        };
        private androidx.core.util.Predicate<java.lang.String> mAllowedTypes = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda13
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$2((java.lang.String) obj);
            }
        };
        private androidx.core.util.Predicate<java.lang.String> mAllowedCategories = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda14
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$3((java.lang.String) obj);
            }
        };
        private androidx.core.util.Predicate<java.lang.String> mAllowedPackages = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda15
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$4((java.lang.String) obj);
            }
        };
        private androidx.core.util.Predicate<android.content.ComponentName> mAllowedComponents = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda16
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$5((android.content.ComponentName) obj);
            }
        };
        private java.util.Map<java.lang.String, androidx.core.util.Predicate<java.lang.Object>> mAllowedExtras = new java.util.HashMap();
        private boolean mAllowClipDataText = false;
        private androidx.core.util.Predicate<android.net.Uri> mAllowedClipDataUri = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda17
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$6((android.net.Uri) obj);
            }
        };
        private androidx.core.util.Predicate<android.content.ClipData> mAllowedClipData = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda18
            @Override // androidx.core.util.Predicate
            public final boolean test(java.lang.Object obj) {
                return androidx.core.content.IntentSanitizer.Builder.lambda$new$7((android.content.ClipData) obj);
            }
        };

        static /* synthetic */ boolean lambda$allowAnyComponent$10(android.content.ComponentName componentName) {
            return true;
        }

        static /* synthetic */ boolean lambda$allowExtra$12(java.lang.Object obj) {
            return true;
        }

        static /* synthetic */ boolean lambda$allowExtra$14(java.lang.Object obj) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$0(java.lang.String str) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$1(android.net.Uri uri) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$2(java.lang.String str) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$3(java.lang.String str) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$4(java.lang.String str) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$5(android.content.ComponentName componentName) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$6(android.net.Uri uri) {
            return false;
        }

        static /* synthetic */ boolean lambda$new$7(android.content.ClipData clipData) {
            return false;
        }

        public androidx.core.content.IntentSanitizer.Builder allowFlags(int i) {
            this.mAllowedFlags = i | this.mAllowedFlags;
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowHistoryStackFlags() {
            this.mAllowedFlags |= HISTORY_STACK_FLAGS;
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowReceiverFlags() {
            this.mAllowedFlags |= RECEIVER_FLAGS;
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowAction(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            allowAction(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda2(str));
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowAction(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowedActions = this.mAllowedActions.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowDataWithAuthority(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            allowData(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda7
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return str.equals(((android.net.Uri) obj).getAuthority());
                }
            });
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowData(androidx.core.util.Predicate<android.net.Uri> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowedData = this.mAllowedData.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowType(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            return allowType(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda2(str));
        }

        public androidx.core.content.IntentSanitizer.Builder allowType(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowedTypes = this.mAllowedTypes.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowCategory(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            return allowCategory(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda2(str));
        }

        public androidx.core.content.IntentSanitizer.Builder allowCategory(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowedCategories = this.mAllowedCategories.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowPackage(java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            java.util.Objects.requireNonNull(str);
            return allowPackage(new androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda2(str));
        }

        public androidx.core.content.IntentSanitizer.Builder allowPackage(androidx.core.util.Predicate<java.lang.String> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowedPackages = this.mAllowedPackages.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowComponent(final android.content.ComponentName componentName) {
            androidx.core.util.Preconditions.checkNotNull(componentName);
            java.util.Objects.requireNonNull(componentName);
            return allowComponent(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda9
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return componentName.equals((android.content.ComponentName) obj);
                }
            });
        }

        public androidx.core.content.IntentSanitizer.Builder allowComponent(androidx.core.util.Predicate<android.content.ComponentName> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowSomeComponents = true;
            this.mAllowedComponents = this.mAllowedComponents.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowComponentWithPackage(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            return allowComponent(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda6
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return str.equals(((android.content.ComponentName) obj).getPackageName());
                }
            });
        }

        public androidx.core.content.IntentSanitizer.Builder allowAnyComponent() {
            this.mAllowAnyComponent = true;
            this.mAllowedComponents = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda4
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.content.IntentSanitizer.Builder.lambda$allowAnyComponent$10((android.content.ComponentName) obj);
                }
            };
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipDataText() {
            this.mAllowClipDataText = true;
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipDataUriWithAuthority(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            return allowClipDataUri(new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return str.equals(((android.net.Uri) obj).getAuthority());
                }
            });
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipDataUri(androidx.core.util.Predicate<android.net.Uri> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowedClipDataUri = this.mAllowedClipDataUri.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowClipData(androidx.core.util.Predicate<android.content.ClipData> predicate) {
            androidx.core.util.Preconditions.checkNotNull(predicate);
            this.mAllowedClipData = this.mAllowedClipData.or(predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String str, java.lang.Class<?> cls) {
            return allowExtra(str, cls, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda10
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.content.IntentSanitizer.Builder.lambda$allowExtra$12(obj);
                }
            });
        }

        public <T> androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String str, final java.lang.Class<T> cls, final androidx.core.util.Predicate<T> predicate) {
            androidx.core.util.Preconditions.checkNotNull(str);
            androidx.core.util.Preconditions.checkNotNull(cls);
            androidx.core.util.Preconditions.checkNotNull(predicate);
            return allowExtra(str, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda5
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.content.IntentSanitizer.Builder.lambda$allowExtra$13(cls, predicate, obj);
                }
            });
        }

        static /* synthetic */ boolean lambda$allowExtra$13(java.lang.Class cls, androidx.core.util.Predicate predicate, java.lang.Object obj) {
            return cls.isInstance(obj) && predicate.test(cls.cast(obj));
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtra(java.lang.String str, androidx.core.util.Predicate<java.lang.Object> predicate) {
            androidx.core.util.Preconditions.checkNotNull(str);
            androidx.core.util.Preconditions.checkNotNull(predicate);
            androidx.core.util.Predicate<java.lang.Object> predicate2 = this.mAllowedExtras.get(str);
            if (predicate2 == null) {
                predicate2 = new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return androidx.core.content.IntentSanitizer.Builder.lambda$allowExtra$14(obj);
                    }
                };
            }
            this.mAllowedExtras.put(str, predicate2.or(predicate));
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraStreamUriWithAuthority(final java.lang.String str) {
            androidx.core.util.Preconditions.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", android.net.Uri.class, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda3
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return str.equals(((android.net.Uri) obj).getAuthority());
                }
            });
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraStream(androidx.core.util.Predicate<android.net.Uri> predicate) {
            allowExtra("android.intent.extra.STREAM", android.net.Uri.class, predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(final java.lang.String str) {
            allowExtra(org.jacoco.core.runtime.AgentOptions.OUTPUT, android.net.Uri.class, new androidx.core.util.Predicate() { // from class: androidx.core.content.IntentSanitizer$Builder$$ExternalSyntheticLambda8
                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return str.equals(((android.net.Uri) obj).getAuthority());
                }
            });
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowExtraOutput(androidx.core.util.Predicate<android.net.Uri> predicate) {
            allowExtra(org.jacoco.core.runtime.AgentOptions.OUTPUT, android.net.Uri.class, predicate);
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowIdentifier() {
            this.mAllowIdentifier = true;
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowSelector() {
            this.mAllowSelector = true;
            return this;
        }

        public androidx.core.content.IntentSanitizer.Builder allowSourceBounds() {
            this.mAllowSourceBounds = true;
            return this;
        }

        public androidx.core.content.IntentSanitizer build() {
            boolean z = this.mAllowAnyComponent;
            if ((z && this.mAllowSomeComponents) || (!z && !this.mAllowSomeComponents)) {
                throw new java.lang.SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            androidx.core.content.IntentSanitizer intentSanitizer = new androidx.core.content.IntentSanitizer();
            intentSanitizer.mAllowedFlags = this.mAllowedFlags;
            intentSanitizer.mAllowedActions = this.mAllowedActions;
            intentSanitizer.mAllowedData = this.mAllowedData;
            intentSanitizer.mAllowedTypes = this.mAllowedTypes;
            intentSanitizer.mAllowedCategories = this.mAllowedCategories;
            intentSanitizer.mAllowedPackages = this.mAllowedPackages;
            intentSanitizer.mAllowAnyComponent = this.mAllowAnyComponent;
            intentSanitizer.mAllowedComponents = this.mAllowedComponents;
            intentSanitizer.mAllowedExtras = this.mAllowedExtras;
            intentSanitizer.mAllowClipDataText = this.mAllowClipDataText;
            intentSanitizer.mAllowedClipDataUri = this.mAllowedClipDataUri;
            intentSanitizer.mAllowedClipData = this.mAllowedClipData;
            intentSanitizer.mAllowIdentifier = this.mAllowIdentifier;
            intentSanitizer.mAllowSelector = this.mAllowSelector;
            intentSanitizer.mAllowSourceBounds = this.mAllowSourceBounds;
            return intentSanitizer;
        }
    }

    private static class Api15Impl {
        private Api15Impl() {
        }

        static void setSelector(android.content.Intent intent, android.content.Intent intent2) {
            intent.setSelector(intent2);
        }

        static android.content.Intent getSelector(android.content.Intent intent) {
            return intent.getSelector();
        }
    }

    private static class Api16Impl {
        private Api16Impl() {
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00bc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00be  */
        /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
        static void sanitizeClipData(android.content.Intent intent, android.content.Intent intent2, androidx.core.util.Predicate<android.content.ClipData> predicate, boolean z, androidx.core.util.Predicate<android.net.Uri> predicate2, androidx.core.util.Consumer<java.lang.String> consumer) {
            java.lang.CharSequence text;
            android.net.Uri uri;
            android.content.ClipData clipData = intent.getClipData();
            if (clipData == null) {
                return;
            }
            if (predicate != null && predicate.test(clipData)) {
                intent2.setClipData(clipData);
                return;
            }
            android.content.ClipData clipData2 = null;
            for (int i = 0; i < clipData.getItemCount(); i++) {
                android.content.ClipData.Item itemAt = clipData.getItemAt(i);
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    androidx.core.content.IntentSanitizer.Api16Impl.Api31Impl.checkOtherMembers(i, itemAt, consumer);
                } else {
                    checkOtherMembers(i, itemAt, consumer);
                }
                if (z) {
                    text = itemAt.getText();
                } else {
                    if (itemAt.getText() != null) {
                        consumer.accept("Item text cannot contain value. Item position: " + i + ". Text: " + ((java.lang.Object) itemAt.getText()));
                    }
                    text = null;
                }
                if (predicate2 == null) {
                    if (itemAt.getUri() != null) {
                        consumer.accept("Item URI is not allowed. Item position: " + i + ". URI: " + itemAt.getUri());
                    }
                } else {
                    if (itemAt.getUri() == null || predicate2.test(itemAt.getUri())) {
                        uri = itemAt.getUri();
                    } else {
                        consumer.accept("Item URI is not allowed. Item position: " + i + ". URI: " + itemAt.getUri());
                    }
                    if (text == null || uri != null) {
                        if (clipData2 == null) {
                            clipData2 = new android.content.ClipData(clipData.getDescription(), new android.content.ClipData.Item(text, null, uri));
                        } else {
                            clipData2.addItem(new android.content.ClipData.Item(text, null, uri));
                        }
                    }
                }
                uri = null;
                if (text == null) {
                    if (clipData2 == null) {
                        clipData2 = new android.content.ClipData(clipData.getDescription(), new android.content.ClipData.Item(text, null, uri));
                    } else {
                        clipData2.addItem(new android.content.ClipData.Item(text, null, uri));
                    }
                } else if (clipData2 == null) {
                    clipData2 = new android.content.ClipData(clipData.getDescription(), new android.content.ClipData.Item(text, null, uri));
                } else {
                    clipData2.addItem(new android.content.ClipData.Item(text, null, uri));
                }
            }
            if (clipData2 != null) {
                intent2.setClipData(clipData2);
            }
        }

        private static void checkOtherMembers(int i, android.content.ClipData.Item item, androidx.core.util.Consumer<java.lang.String> consumer) {
            if (item.getHtmlText() == null && item.getIntent() == null) {
                return;
            }
            consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        }

        private static class Api31Impl {
            private Api31Impl() {
            }

            static void checkOtherMembers(int i, android.content.ClipData.Item item, androidx.core.util.Consumer<java.lang.String> consumer) {
                if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                    return;
                }
                consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static android.content.Intent setIdentifier(android.content.Intent intent, java.lang.String str) {
            return intent.setIdentifier(str);
        }

        static java.lang.String getIdentifier(android.content.Intent intent) {
            return intent.getIdentifier();
        }
    }
}
