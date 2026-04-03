package com.student;

import java.util.Comparator;

class studentComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		int cityCompare = s2.getCity().compareTo(s1.getCity());
		if (cityCompare != 0) {
			return cityCompare;
		}
		int marksCompare = -Double.compare(s1.getMarks(), s2.getMarks());
		if (marksCompare != 0) {
			return marksCompare;
		}
		return s1.getName().compareTo(s2.getName());
	}
}