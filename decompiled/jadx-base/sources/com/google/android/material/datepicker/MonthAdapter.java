package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
class MonthAdapter extends android.widget.BaseAdapter {
    final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    com.google.android.material.datepicker.CalendarStyle calendarStyle;
    final com.google.android.material.datepicker.DateSelector<?> dateSelector;
    final com.google.android.material.datepicker.Month month;
    private java.util.Collection<java.lang.Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = com.google.android.material.datepicker.UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (com.google.android.material.datepicker.UtcDates.getUtcCalendar().getMaximum(5) + com.google.android.material.datepicker.UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    MonthAdapter(com.google.android.material.datepicker.Month month, com.google.android.material.datepicker.DateSelector<?> dateSelector, com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    @Override // android.widget.Adapter
    public java.lang.Long getItem(int i) {
        if (i < firstPositionInMonth() || i > lastPositionInMonth()) {
            return null;
        }
        return java.lang.Long.valueOf(this.month.getDay(positionToDay(i)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.month.daysInWeek;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public android.widget.TextView getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        initializeStyles(viewGroup.getContext());
        android.widget.TextView textView = (android.widget.TextView) view;
        if (view == null) {
            textView = (android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.material.R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i - firstPositionInMonth();
        if (iFirstPositionInMonth < 0 || iFirstPositionInMonth >= this.month.daysInMonth) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = iFirstPositionInMonth + 1;
            textView.setTag(this.month);
            textView.setText(java.lang.String.format(textView.getResources().getConfiguration().locale, com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT, java.lang.Integer.valueOf(i2)));
            long day = this.month.getDay(i2);
            if (this.month.year == com.google.android.material.datepicker.Month.current().year) {
                textView.setContentDescription(com.google.android.material.datepicker.DateStrings.getMonthDayOfWeekDay(day));
            } else {
                textView.setContentDescription(com.google.android.material.datepicker.DateStrings.getYearMonthDayOfWeekDay(day));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        java.lang.Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue());
        return textView;
    }

    public void updateSelectedStates(com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView) {
        java.util.Iterator<java.lang.Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        com.google.android.material.datepicker.DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            java.util.Iterator<java.lang.Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    private void updateSelectedStateForDate(com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView, long j) {
        if (com.google.android.material.datepicker.Month.create(j).equals(this.month)) {
            updateSelectedState((android.widget.TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(this.month.getDayOfMonth(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    private void updateSelectedState(android.widget.TextView textView, long j) {
        com.google.android.material.datepicker.CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        if (this.calendarConstraints.getDateValidator().isValid(j)) {
            textView.setEnabled(true);
            if (isSelected(j)) {
                calendarItemStyle = this.calendarStyle.selectedDay;
            } else if (com.google.android.material.datepicker.UtcDates.getTodayCalendar().getTimeInMillis() == j) {
                calendarItemStyle = this.calendarStyle.todayDay;
            } else {
                calendarItemStyle = this.calendarStyle.day;
            }
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        calendarItemStyle.styleItem(textView);
    }

    private boolean isSelected(long j) {
        java.util.Iterator<java.lang.Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(j) == com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void initializeStyles(android.content.Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new com.google.android.material.datepicker.CalendarStyle(context);
        }
    }

    int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i) {
        return (i - firstPositionInMonth()) + 1;
    }

    int dayToPosition(int i) {
        return firstPositionInMonth() + (i - 1);
    }

    boolean withinMonth(int i) {
        return i >= firstPositionInMonth() && i <= lastPositionInMonth();
    }

    boolean isFirstInRow(int i) {
        return i % this.month.daysInWeek == 0;
    }

    boolean isLastInRow(int i) {
        return (i + 1) % this.month.daysInWeek == 0;
    }
}
