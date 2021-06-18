google.charts.load('current', { packages: ['corechart', 'line'] });
google.charts.setOnLoadCallback(drawBasic);

function drawBasic() {

  var data = new google.visualization.DataTable();
  data.addColumn('number', 'X');
  data.addColumn('number', 'Dogs');

  data.addRows([
    [30, 55], [31, 60], [32, 61], [33, 59], [34, 62], [35, 65],
    [36, 62], [39, 61], [40, 64], [41, 65],
    [48, 72], [49, 68], [50, 66], [51, 65], [52, 67], [53, 70],
  ]);

  var options = {
    height: 100,
    chartArea: {
      top: -50,
      height: "50px",
      width: 100
    },
    series: {
      0: {
        areaOpacity: 0.3,
        color: '#00d5ff',
        type: 'area',
        visibleInLegend: false
      },
    },
    legend: { position: 'none' },
    gridlines: {
      color: 'rgba(2, 132, 146, 0)'
    },
    hAxis: {
      baselineColor: 'none',
      ticks: []
    },
    vAxis: {
      baselineColor: 'none',
      ticks: []
    }
  }

  var chart1 = new google.visualization.LineChart(document.getElementById('chartdiv-1'));
  chart1.draw(data, options);

  var chart2 = new google.visualization.LineChart(document.getElementById('chartdiv-2'));
  chart2.draw(data, options);

  var chart3 = new google.visualization.LineChart(document.getElementById('chartdiv-3'));
  chart3.draw(data, options);

  var chart4 = new google.visualization.LineChart(document.getElementById('chartdiv-4'));
  chart4.draw(data, options);

}


function toggleSidebar() {
  const sidebar = document.getElementById("admin-sidebar");
  if(sidebar.style.display === "none") {
    sidebar.style.display = "inline-block";
  } else {
    sidebar.style.display = "none";
  }
}