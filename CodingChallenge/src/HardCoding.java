public interface HardCoding {

    /**
     * Given an integer array nums of length n,
     * you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i]
     * for 0 <= i < n (0-indexed).
     * Specifically, ans is the concatenation of two nums arrays.
     * @param nums
     * @return the array ans
     */
    int[] getConcatination(int[] nums);

    /**
     * Given a valid (IPv4) IP address, return a defanged version of that IP address.
     *
     * A defanged IP address replaces every period "." with "[.]".
     * @param address
     * @return the configured IP address
     */
    String defangIPaddr(String address);
}
