class Kata {
    static String camelCase(final String string) {
		if (!"".equals(string)) {
			String[] array = string.split(" ");
			String camelCase = "";
			for (int i = 0; i < array.length; i++) {
				String first = array[i].substring(0, 1);
				first = first.toUpperCase();
				array[i] = first + array[i].substring(1);
				camelCase += array[i];

			}
			return camelCase;
		} else {
			return string;
		}
	}
}
