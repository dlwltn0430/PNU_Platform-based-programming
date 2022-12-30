package application;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;

public class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;

	// Clock pane's width and height
	private double w = 250, h = 250;

	/** Construct a default clock with the current time */
	public ClockPane() {
		setCurrentTime();
	}

	/** Construct a click with specified hour, minute, and second */
	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}

	/** Return hour */
	public int getHour() {
		return hour;
	}

	/** Set a new hour */
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}

	/** Return minute */
	public int getMinute() {
		return minute;
	}

	/** Set a new minute */
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	/** Return second */
	public int getSecond() {
		return second;
	}

	/** Set a new second */
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}

	/** Return clock pane's width */
	public double getW() {
		return w;
	}
	
	/** Set clock pane's width */
	public void setW(double w) {
		this.w = w;
		paintClock();
	}

	/** Return clock pane's height */
	public double getH() {
		return h;
	}
	
	public void setH(double h) {
		this.h = h;
		paintClock();
	}
	
	public void setCurrentTime() {
		Calendar calendar = new GregorianCalendar();
		
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		
		paintClock();
	}
	
	protected void paintClock() {
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;
		
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);

		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);
		
		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);
		
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
		
		getChildren().clear();
		getChildren().addAll(circle, sLine, mLine, hLine);

		Group clockHands = new Group();
		Group numbers = new Group();
		
		//create big clock-calibrations(12)
		for (int i = 0; i < 12; i++) {
			Line clockHand = new Line(0, clockRadius, 0, clockRadius - 10);
			clockHand.setTranslateX(centerX);
			clockHand.setTranslateY(centerY);
			clockHand.getTransforms().add(new Rotate(i * (360 / 12)));
			clockHands.getChildren().add(clockHand);
		}

		//create small clock-calibrations(60)
		for (int i = 0; i < 60; i++) {
		Line clockHand = new Line(0, clockRadius, 0, clockRadius - 5);
			clockHand.setTranslateX(centerX);
			clockHand.setTranslateY(centerY);
			clockHand.getTransforms().add(new Rotate(i * (360 / 60)));
			clockHands.getChildren().add(clockHand);
		}

		//create numbers on clock from 1 to 12
		int num = 12; //start with 12
		
		for (int i = 0; i < 12; i++) {
			//find proper position
			double x = centerX + (clockRadius - 20) * Math.sin((i % 12) * (2 * Math.PI / 12));
			double y = centerY - (clockRadius - 20) * Math.cos((i % 12) * (2 * Math.PI / 12));
			
			//minus or plus 5 to put hour labels in a proper position
			Text hour = new Text(x - 5 , y + 5, "" + num);
			numbers.getChildren().add(hour);
			num++;
			
			//numbers on clock start with 12 and then come with 1, 2, 3,....
			if (num > 12) num = 1;
		}
		getChildren().add(clockHands);
		getChildren().add(numbers);
	}
}