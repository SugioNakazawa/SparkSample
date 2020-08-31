import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class HelloWorld {

	public static void main(String[] args) {
		// SparkConf の生成。各種コンフィギュレーションを設定
		SparkConf sparkConf = new SparkConf();
		sparkConf.setMaster("local");
		sparkConf.setAppName("HelloWorld");
		// JavaSparkContext の生成
		JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);

		System.out.println("練習 Start ==================================================");
		// 入力データ作成
		List<String> inputData = new ArrayList<String>();
		inputData = Arrays.asList("Hello", "World", "!!!");
		// JavaRDD生成
		JavaRDD<String> rdd = javaSparkContext.parallelize(inputData);
		// JavaRDDの内容を標準出力に出力する
		rdd.foreach(val -> System.out.println(val));
		System.out.println("練習 End ==================================================");

		// コンテキストの終了
		javaSparkContext.close();
	}
}
