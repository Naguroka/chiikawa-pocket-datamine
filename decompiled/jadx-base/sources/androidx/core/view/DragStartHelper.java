package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final androidx.core.view.DragStartHelper.OnDragStartListener mListener;
    private final android.view.View.OnLongClickListener mLongClickListener = new android.view.View.OnLongClickListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(android.view.View view) {
            return this.f$0.onLongClick(view);
        }
    };
    private final android.view.View.OnTouchListener mTouchListener = new android.view.View.OnTouchListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda1
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            return this.f$0.onTouch(view, motionEvent);
        }
    };
    private final android.view.View mView;

    public interface OnDragStartListener {
        boolean onDragStart(android.view.View view, androidx.core.view.DragStartHelper dragStartHelper);
    }

    public DragStartHelper(android.view.View view, androidx.core.view.DragStartHelper.OnDragStartListener onDragStartListener) {
        this.mView = view;
        this.mListener = onDragStartListener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = x;
            this.mLastTouchY = y;
        } else if (action == 1) {
            this.mDragging = false;
        } else if (action != 2) {
            if (action == 3) {
                this.mDragging = false;
            }
        } else if (androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.mDragging && (this.mLastTouchX != x || this.mLastTouchY != y)) {
            this.mLastTouchX = x;
            this.mLastTouchY = y;
            boolean zOnDragStart = this.mListener.onDragStart(view, this);
            this.mDragging = zOnDragStart;
            return zOnDragStart;
        }
        return false;
    }

    public boolean onLongClick(android.view.View view) {
        return this.mListener.onDragStart(view, this);
    }

    public void getTouchPosition(android.graphics.Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }
}
