package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
class YearGridAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.datepicker.YearGridAdapter.ViewHolder> {
    private final com.google.android.material.datepicker.MaterialCalendar<?> materialCalendar;

    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final android.widget.TextView textView;

        ViewHolder(android.widget.TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    YearGridAdapter(com.google.android.material.datepicker.MaterialCalendar<?> materialCalendar) {
        this.materialCalendar = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public com.google.android.material.datepicker.YearGridAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return new com.google.android.material.datepicker.YearGridAdapter.ViewHolder((android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.material.R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(com.google.android.material.datepicker.YearGridAdapter.ViewHolder viewHolder, int i) {
        int yearForPosition = getYearForPosition(i);
        java.lang.String string = viewHolder.textView.getContext().getString(com.google.android.material.R.string.mtrl_picker_navigate_to_year_description);
        viewHolder.textView.setText(java.lang.String.format(java.util.Locale.getDefault(), com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT, java.lang.Integer.valueOf(yearForPosition)));
        viewHolder.textView.setContentDescription(java.lang.String.format(string, java.lang.Integer.valueOf(yearForPosition)));
        com.google.android.material.datepicker.CalendarStyle calendarStyle = this.materialCalendar.getCalendarStyle();
        java.util.Calendar todayCalendar = com.google.android.material.datepicker.UtcDates.getTodayCalendar();
        com.google.android.material.datepicker.CalendarItemStyle calendarItemStyle = todayCalendar.get(1) == yearForPosition ? calendarStyle.todayYear : calendarStyle.year;
        java.util.Iterator<java.lang.Long> it = this.materialCalendar.getDateSelector().getSelectedDays().iterator();
        while (it.hasNext()) {
            todayCalendar.setTimeInMillis(it.next().longValue());
            if (todayCalendar.get(1) == yearForPosition) {
                calendarItemStyle = calendarStyle.selectedYear;
            }
        }
        calendarItemStyle.styleItem(viewHolder.textView);
        viewHolder.textView.setOnClickListener(createYearClickListener(yearForPosition));
    }

    private android.view.View.OnClickListener createYearClickListener(final int i) {
        return new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.google.android.material.datepicker.YearGridAdapter.this.materialCalendar.setCurrentMonth(com.google.android.material.datepicker.YearGridAdapter.this.materialCalendar.getCalendarConstraints().clamp(com.google.android.material.datepicker.Month.create(i, com.google.android.material.datepicker.YearGridAdapter.this.materialCalendar.getCurrentMonth().month)));
                com.google.android.material.datepicker.YearGridAdapter.this.materialCalendar.setSelector(com.google.android.material.datepicker.MaterialCalendar.CalendarSelector.DAY);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.materialCalendar.getCalendarConstraints().getYearSpan();
    }

    int getPositionForYear(int i) {
        return i - this.materialCalendar.getCalendarConstraints().getStart().year;
    }

    int getYearForPosition(int i) {
        return this.materialCalendar.getCalendarConstraints().getStart().year + i;
    }
}
