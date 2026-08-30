package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbkk extends android.webkit.WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.doUpdateVisitedHistory(webView, str, z);
    }

    protected abstract android.webkit.WebViewClient getDelegate();

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i, android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return null;
        }
        return delegate.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        android.webkit.WebViewClient delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        return delegate.shouldOverrideUrlLoading(webView, str);
    }
}
