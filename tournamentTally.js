export function tournamentTally(input) {
    const results = {};
    const lines = input.split('\n');
  
    for (const line of lines) {
      if (!line.trim()) continue;
      const [team1, team2, result] = line.split(';');
  
      if (!results[team1]) results[team1] = { name: team1, MP: 0, W: 0, D: 0, L: 0, P: 0 };
      if (!results[team2]) results[team2] = { name: team2, MP: 0, W: 0, D: 0, L: 0, P: 0 };
  
      results[team1].MP++;
      results[team2].MP++;
  
      if (result === 'win') {
        results[team1].W++;
        results[team1].P += 3;
        results[team2].L++;
      } else if (result === 'loss') {
        results[team2].W++;
        results[team2].P += 3;
        results[team1].L++;
      } else if (result === 'draw') {
        results[team1].D++;
        results[team2].D++;
        results[team1].P += 1;
        results[team2].P += 1;
      }
    }
  
    const sorted = sort(Object.values(results), 'P', 'name');
  
    const header = 'Team                           | MP |  W |  D |  L |  P';
    const rows = sorted.map(t =>
      `${t.name.padEnd(31)}| ${String(t.MP).padStart(2)} | ${String(t.W).padStart(2)} | ${String(t.D).padStart(2)} | ${String(t.L).padStart(2)} | ${String(t.P).padStart(2)}`
    );
  
    return [header, ...rows].join('\n');
  }
  
  // Provided sorting function
  function sort(data, pointsKey, nameKey) {
    return data.sort((a, b) => {
      const pointsComparison = b[pointsKey] - a[pointsKey];
      if (pointsComparison !== 0) {
        return pointsComparison;
      }
      return a[nameKey].localeCompare(b[nameKey]);
    });
  }
  