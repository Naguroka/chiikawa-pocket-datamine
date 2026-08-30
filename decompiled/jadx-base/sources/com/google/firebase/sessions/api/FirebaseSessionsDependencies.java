package com.google.firebase.sessions.api;

/* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\r\u0010\u0017\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t\u0018\u00010\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "()V", "TAG", "", "dependencies", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "kotlin.jvm.PlatformType", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "addDependency", "", "subscriberName", "getDependency", "getRegisteredSubscribers", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriber", "getSubscriber$com_google_firebase_firebase_sessions", "register", "subscriber", "reset", "reset$com_google_firebase_firebase_sessions", "Dependency", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseSessionsDependencies {
    private static final java.lang.String TAG = "SessionsDependencies";
    public static final com.google.firebase.sessions.api.FirebaseSessionsDependencies INSTANCE = new com.google.firebase.sessions.api.FirebaseSessionsDependencies();
    private static final java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    private FirebaseSessionsDependencies() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void addDependency(com.google.firebase.sessions.api.SessionSubscriber.Name subscriberName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName == com.google.firebase.sessions.api.SessionSubscriber.Name.PERFORMANCE) {
            throw new java.lang.IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            android.util.Log.d(TAG, "Dependency " + subscriberName + " already added.");
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency(kotlinx.coroutines.sync.MutexKt.Mutex(true), null, 2, 0 == true ? 1 : 0));
        android.util.Log.d(TAG, "Dependency to " + subscriberName + " added.");
    }

    @kotlin.jvm.JvmStatic
    public static final void register(com.google.firebase.sessions.api.SessionSubscriber subscriber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        com.google.firebase.sessions.api.SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency = INSTANCE.getDependency(sessionSubscriberName);
        if (dependency.getSubscriber() != null) {
            android.util.Log.d(TAG, "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        dependency.setSubscriber(subscriber);
        android.util.Log.d(TAG, "Subscriber " + sessionSubscriberName + " registered.");
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(dependency.getMutex(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a4 -> B:27:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L14
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 != r4) goto L41
            java.lang.Object r2 = r0.L$5
            java.lang.Object r5 = r0.L$4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$3
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$0
            java.util.Map r9 = (java.util.Map) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto La5
        L41:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L49:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
            r2.<init>(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6e:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb8
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.getMutex()
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r7
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.label = r4
            java.lang.Object r11 = r6.lock(r3, r0)
            if (r11 != r1) goto La4
            return r1
        La4:
            r9 = r5
        La5:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lb3
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lb3
            r6.unlock(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L6e
        Lb3:
            r11 = move-exception
            r6.unlock(r3)
            throw r11
        Lb8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(com.google.firebase.sessions.api.SessionSubscriber.Name subscriberName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        com.google.firebase.sessions.api.SessionSubscriber subscriber = getDependency(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new java.lang.IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }

    private final com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency getDependency(com.google.firebase.sessions.api.SessionSubscriber.Name subscriberName) {
        java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency> dependencies2 = dependencies;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency = dependencies2.get(subscriberName);
        if (dependency == null) {
            throw new java.lang.IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
        return dependency;
    }

    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "subscriber", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "(Lkotlinx/coroutines/sync/Mutex;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "getSubscriber", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class Dependency {
        private final kotlinx.coroutines.sync.Mutex mutex;
        private com.google.firebase.sessions.api.SessionSubscriber subscriber;

        public static /* synthetic */ com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency copy$default(com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency, kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mutex = dependency.mutex;
            }
            if ((i & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(mutex, sessionSubscriber);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final kotlinx.coroutines.sync.Mutex getMutex() {
            return this.mutex;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public final com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency copy(kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber subscriber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "mutex");
            return new com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency(mutex, subscriber);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency)) {
                return false;
            }
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency dependency = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.mutex, dependency.mutex) && kotlin.jvm.internal.Intrinsics.areEqual(this.subscriber, dependency.subscriber);
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public java.lang.String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        public Dependency(kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        public /* synthetic */ Dependency(kotlinx.coroutines.sync.Mutex mutex, com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(mutex, (i & 2) != 0 ? null : sessionSubscriber);
        }

        public final kotlinx.coroutines.sync.Mutex getMutex() {
            return this.mutex;
        }

        public final com.google.firebase.sessions.api.SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public final void setSubscriber(com.google.firebase.sessions.api.SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }
    }
}
