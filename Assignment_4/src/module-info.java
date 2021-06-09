module Assignment_4 {
	requires junit;
	requires org.junit.jupiter.api;
	exports com.ss.jb.four to junit;
	exports com.ss.jb.four.Assignment_4_2 to junit;
	exports com.ss.jb.four.Assignment_4_3 to junit;
	exports com.ss.jb.four.test to junit;
}