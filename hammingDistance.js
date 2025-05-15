export function hammingDistance(strand1, strand2) {
  if (strand1.length !== strand2.length) {
    throw new Error("Strands must be of equal length");
  }

  return [...strand1].reduce((distance, nucleotide, index) => {
    return distance + (nucleotide !== strand2[index] ? 1 : 0);
  }, 0);
}
