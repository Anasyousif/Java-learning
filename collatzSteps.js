export function collatzSteps(number) {
  if (number <= 0 || !Number.isInteger(number)) {
    throw new Error("Input must be a positive integer.");
  }

  let steps = 0;
  while (number !== 1 && steps < 200) {
    number = number % 2 === 0 ? number / 2 : number * 3 + 1;
    steps++;
  }

  return steps;
}
