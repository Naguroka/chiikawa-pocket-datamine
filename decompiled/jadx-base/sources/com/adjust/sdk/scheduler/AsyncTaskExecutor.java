package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AsyncTaskExecutor<Params, Result> {

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.Object[] f106a;
        public final /* synthetic */ android.os.Handler b;

        /* JADX INFO: renamed from: com.adjust.sdk.scheduler.AsyncTaskExecutor$a$a, reason: collision with other inner class name */
        public class RunnableC0014a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ java.lang.Object f107a;

            public RunnableC0014a(java.lang.Object obj) {
                this.f107a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.scheduler.AsyncTaskExecutor.this.onPostExecute(this.f107a);
            }
        }

        public a(java.lang.Object[] objArr, android.os.Handler handler) {
            this.f106a = objArr;
            this.b = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public final void run() {
            this.b.post(new com.adjust.sdk.scheduler.AsyncTaskExecutor.a.RunnableC0014a(com.adjust.sdk.scheduler.AsyncTaskExecutor.this.doInBackground(this.f106a)));
        }
    }

    public abstract Result doInBackground(Params[] paramsArr);

    @java.lang.SafeVarargs
    public final com.adjust.sdk.scheduler.AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new com.adjust.sdk.scheduler.AsyncTaskExecutor.a(paramsArr, new android.os.Handler(android.os.Looper.getMainLooper())));
        return this;
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }
}
