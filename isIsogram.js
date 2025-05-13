export function isIsogram(string) {
  const lettersOnly = string
    .toLowerCase()
    .split('')
    .filter(char => /[a-z]/.test(char)); // ignore non-letter characters

  const seen = new Set();

  for (const char of lettersOnly) {
    if (seen.has(char)) {
      return false; // repeating letter found
    }
    seen.add(char);
  }

  return true; // all letters are unique
}

