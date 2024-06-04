package net.mcreator.nesteyscitiesmod.procedures;

import java.util.Calendar;

public class ShowTimeProcedure {
	public static String execute() {
		return Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + "";
	}
}
