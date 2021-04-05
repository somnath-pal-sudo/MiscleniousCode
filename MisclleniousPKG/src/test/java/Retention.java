import static java.lang.annotation.RetentionPolicy.CLASS;

@java.lang.annotation.Retention(CLASS)
public @interface Retention {
	//int count=10;

	int value() default 0;
	

}
