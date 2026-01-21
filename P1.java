public class P1 {
    public static void main(String[] args) {

        // ^abc$  → string must be EXACTLY "abc"
        System.out.println("abc".matches("^abc$"));     // true  (exact match)
        System.out.println("xabc".matches("^abc$"));    // false (extra char at start)
        System.out.println("abcx".matches("^abc$"));    // false (extra char at end)
        System.out.println("xabcx".matches("^abc$"));   // false (extra chars both sides)


        // ^\\d+$ → only digits, one or more times
        // \\d = digit (0–9)
        // +  = one or more
        System.out.println("12345".matches("^\\d+$"));  // true  (all digits)
        System.out.println("123a".matches("^\\d+$"));   // false ('a' is not digit)
        System.out.println("12 3".matches("^\\d+$"));   // false (space not allowed)


        // o? → 'o' can appear 0 or 1 time
        System.out.println("color".matches("^colo?r$"));   // true  ('o' appears once)
        System.out.println("colr".matches("^colo?r$"));    // true  ('o' appears 0 times)
        System.out.println("coloor".matches("^colo?r$"));  // false ('o' appears twice)


        // \\d\\d?\\d → digit, optional digit, digit
        System.out.println("100".matches("\\d\\d?\\d"));  // true  (3 digits)
        System.out.println("10".matches("\\d\\d?\\d"));   // true  (2 digits)
        System.out.println("1".matches("\\d\\d?\\d"));    // false (only 1 digit)


        // \\w+ → one or more WORD characters (A–Z, a–z, 0–9, _)
        System.out.println("abc123".matches("\\w+"));     // true
        System.out.println("A_B9".matches("\\w+"));       // true
        System.out.println("abc-123".matches("\\w+"));   // false ('-' not allowed)


        // \\w* → zero or more WORD characters
        System.out.println("".matches("\\w*"));           // true (empty allowed)
        System.out.println("Test_01".matches("\\w*"));    // true
        System.out.println("Test 01".matches("\\w*"));    // false (space not allowed)


        // ^\\w+$ → one or more word characters, full string
        System.out.println("User_123".matches("^\\w+$")); // true
        System.out.println("User-123".matches("^\\w+$")); // false ('-')
        System.out.println("User 123".matches("^\\w+$")); // false (space)


        // Same meaning: \\w+ == [A-Za-z0-9_]+
        System.out.println("abc_123".matches("\\w+"));            // true
        System.out.println("abc_123".matches("[A-Za-z0-9_]+"));   // true


        // \\s+ → one or more whitespace characters (space, tab, newline)
        System.out.println("   ".matches("\\s+"));     // true
        System.out.println("\t\t".matches("\\s+"));    // true
        System.out.println(" ".matches("\\s+"));       // true
        System.out.println(" a ".matches("\\s+"));     // false ('a')


        // \\s* → zero or more whitespace characters
        System.out.println("".matches("\\s*"));        // true
        System.out.println("   ".matches("\\s*"));     // true
        System.out.println(" a ".matches("\\s*"));     // false


        // ^\\s+$ → ONLY whitespace, at least one
        System.out.println("   ".matches("^\\s+$"));   // true
        System.out.println(" \t ".matches("^\\s+$"));  // true
        System.out.println(" a ".matches("^\\s+$"));   // false


        // \\d{4} → exactly 4 digits
        System.out.println("1234".matches("\\d{4}"));  // true
        System.out.println("123".matches("\\d{4}"));   // false
        System.out.println("12345".matches("\\d{4}")); // false


        // [A-Z]{3} → exactly 3 uppercase letters
        System.out.println("ABC".matches("[A-Z]{3}"));  // true
        System.out.println("AB".matches("[A-Z]{3}"));   // false
        System.out.println("ABCD".matches("[A-Z]{3}")); // false


        // (abc){2} → "abc" repeated exactly 2 times
        System.out.println("abcabc".matches("(abc){2}")); // true
        System.out.println("abc".matches("(abc){2}"));    // false


        // ^\\d{4}$ → exactly 4 digits, nothing else
        System.out.println("9999".matches("^\\d{4}$"));  // true
        System.out.println("99a9".matches("^\\d{4}$"));  // false
        System.out.println("999".matches("^\\d{4}$"));   // false


        // \\d{3,5} → digits between 3 and 5 length
        System.out.println("123".matches("\\d{3,5}"));     // true
        System.out.println("12345".matches("\\d{3,5}"));   // true
        System.out.println("12".matches("\\d{3,5}"));      // false
        System.out.println("123456".matches("\\d{3,5}"));  // false


        // [A-Z]{2,5} → 2 to 5 uppercase letters
        System.out.println("ABCD".matches("[A-Z]{2,5}"));   // true
        System.out.println("AB".matches("[A-Z]{2,5}"));     // true
        System.out.println("ABCDE".matches("[A-Z]{2,5}")); // true
        System.out.println("A".matches("[A-Z]{2,5}"));      // false


        // (abc){2,3} → "abc" repeated 2 or 3 times
        System.out.println("abcabc".matches("(abc){2,3}"));      // true
        System.out.println("abcabcabc".matches("(abc){2,3}"));   // true
        System.out.println("abc".matches("(abc){2,3}"));         // false


        // Mobile number:
        // starts with 6–9 and total digits = 10 or 11
        System.out.println("9876543210".matches("^[6-9]\\d{9,10}$")); // true
        System.out.println("987654321".matches("^[6-9]\\d{9,10}$"));  // false


        // (cat|dog) → either "cat" OR "dog"
        System.out.println("cat".matches("^(cat|dog)$"));     // true
        System.out.println("dog".matches("^(cat|dog)$"));     // true
        System.out.println("catdog".matches("^(cat|dog)$"));  // false


        // [A-Z]|[a-z] → exactly ONE letter
        System.out.println("A".matches("[A-Z]|[a-z]"));  // true
        System.out.println("a".matches("[A-Z]|[a-z]"));  // true
        System.out.println("1".matches("[A-Z]|[a-z]"));  // false


        // Either ONLY digits OR ONLY uppercase letters
        System.out.println("123".matches("\\d+|[A-Z]+")); // true
        System.out.println("ABC".matches("\\d+|[A-Z]+")); // true
        System.out.println("A1".matches("\\d+|[A-Z]+"));  // false


        // Title check
        System.out.println("Mr".matches("(Mr|Mrs|Ms)"));  // true
        System.out.println("Mrs".matches("(Mr|Mrs|Ms)")); // true
        System.out.println("Ms".matches("(Mr|Mrs|Ms)"));  // true
        System.out.println("Dr".matches("(Mr|Mrs|Ms)"));  // false


        // Payment mode validation
        System.out.println("UPI".matches("^(UPI|CASH|CARD)$")); // true
        System.out.println("NET".matches("^(UPI|CASH|CARD)$")); // false













//         Q1. Write a regular expression to validate a mobile number with the following rules:
// 	Must start with 6, 7, 8, or 9
// 	Must contain exactly 10 digits
	
// Q2. Write a regular expression to validate an email ID with the following conditions:
// 	Username part can contain:
// 	letters (a–z, A–Z)
// 	digits (0–9)
// 	special characters: . _ % + -
// 	Must contain @
// 	Domain name should contain only letters
// 	Extension should contain at least 2 letters
	
// Q3. Write a regular expression to validate a password with the following rules:
// 	Minimum 8 characters
// 	Must contain at least one uppercase letter
// 	Must contain at least one digit
	
// Q4. Write a regular expression to validate a username with these rules:
// 	Must start with a letter
// 	Can contain letters, digits, and underscore (_)
// 	Length should be between 5 and 15 characters
	
// Q5. OTP and PIN Code Validation
// 	(a) OTP Validation
// 	Write a regular expression to validate a 6-digit OTP.
// 	(b) PIN Code Validation
// 	Write a regular expression to validate a 4-digit PIN.
	
// Q6. Write a regular expression to validate an Indian vehicle number in the following format:MH12AB1234

// Q7. Write a regular expression to validate a date in the format: dd-mm-yyyy
    }
}
