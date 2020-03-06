class basic1_2{
	public static void main(String[] args) {
		//2、循环输入10个数(50以内),统计每个数出现的次数
		int[] arr = new int[50];
		for (int i = 0; i < 10; i++) {
			int number = (int) (Math.random() * 50 +1);
			for (int j = 0; j < 50; j++) {
				if (j == number - 1) {
					arr[j]++;
					System.out.println(arr[j] + "-----" + number);
				}
			}
		}
		for (int i = 0; i < 50; i++) {
			if (arr[i] != 0) {
				System.out.println((i + 1) + "出现了:" + arr[i] + "次");
			}
		}
	}
}