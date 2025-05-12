export function colorCode(color) {
  const colorMap = {
    black: 0,
    brown: 1,
    red: 2,
    orange: 3,
    yellow: 4,
    green: 5,
    blue: 6,
    violet: 7,
    grey: 8,
    white: 9
  };
  return colorMap[color.toLowerCase()];
}

export function decodedValue(values) {
  const firstDigit = colorCode(values[0]);
  const secondDigit = colorCode(values[1]);
  return firstDigit * 10 + secondDigit;
}
