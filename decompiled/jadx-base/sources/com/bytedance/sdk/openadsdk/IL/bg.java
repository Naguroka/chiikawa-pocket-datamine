package com.bytedance.sdk.openadsdk.IL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bg {
    protected boolean bg = false;
    private final java.util.concurrent.ExecutorService IL = java.util.concurrent.Executors.newSingleThreadExecutor();

    protected abstract void bg(java.util.List<java.io.File> list);

    protected abstract boolean bg(long j, int i);

    protected abstract boolean bg(java.io.File file, long j, int i);

    public void bg(java.io.File file) throws java.io.IOException {
        this.IL.submit(new com.bytedance.sdk.openadsdk.IL.bg.CallableC0123bg(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(java.io.File file) throws java.io.IOException {
        if (this.bg) {
            java.util.List<java.io.File> listBg = com.bytedance.sdk.component.utils.ldr.bg(file);
            java.lang.Object[] objArr = new java.lang.Object[2];
            listBg.toString();
            bg(listBg);
            return;
        }
        try {
            com.bytedance.sdk.component.utils.ldr.IL(file);
        } catch (java.lang.Throwable unused) {
        }
        bg(com.bytedance.sdk.component.utils.ldr.bg(file.getParentFile()));
    }

    long IL(java.util.List<java.io.File> list) {
        java.util.Iterator<java.io.File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.IL.bg$bg, reason: collision with other inner class name */
    private class CallableC0123bg implements java.util.concurrent.Callable<java.lang.Void> {
        private final java.io.File IL;

        private CallableC0123bg(java.io.File file) {
            this.IL = file;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public java.lang.Void call() throws java.lang.Exception {
            com.bytedance.sdk.openadsdk.IL.bg.this.IL(this.IL);
            return null;
        }
    }
}
