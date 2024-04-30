var secondLargestElement = (nums) => {
  const n = nums.length;
  let max = Number.MIN_SAFE_INTEGER,
    secMax = Number.MIN_SAFE_INTEGER;
  for (let i = 0; i < n; i++) {
    if (nums[i] >= max) {
      secMax = max;
      max = nums[i];
    } else if (nums[i] > secMax && nums[i] < max) {
      secMax = nums[i];
    }
  }
  secMax
  return secMax;
};
secondLargestElement([-12, -14, -15, -17, 20]);
