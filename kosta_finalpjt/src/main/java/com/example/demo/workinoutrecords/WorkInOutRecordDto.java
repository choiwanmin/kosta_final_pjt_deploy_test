package com.example.demo.workinoutrecords;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import com.example.demo.members.Members;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WorkInOutRecordDto {
	private int daynum;
	private Members user;
	private DayOfWeek dayOfWeek;
	private LocalDate day;
	private LocalTime workinTime;
	private LocalTime workOutTime;
	private String state;
}
