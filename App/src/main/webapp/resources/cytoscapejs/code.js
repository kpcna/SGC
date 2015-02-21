$(function(){ // on dom ready

$('#cy').cytoscape({
  layout: {
    name: 'cose',
    padding: 10
  },
  
  style: cytoscape.stylesheet()
    .selector('node')
      .css({
        'shape': 'data(faveShape)',
        'width': '50',
        'content': 'data(name)',
        'text-valign': 'center',
        'text-outline-width': 0.5,
        'text-outline-color': '#000000',
        'background-color': 'data(faveColor)',
        'color': '#fff',
	'font-size': '12'
      })
    .selector(':selected')
      .css({
        'border-width': 1,
        'border-color': '#333',
	'background-color': '#D67834',
	'color': '#fff'
      })
    .selector('edge')
      .css({
        'opacity': 0.666,
        'width': '0.5',
        'target-arrow-shape': 'none',
        'source-arrow-shape': 'none',
        'line-color': 'data(faveColor)',
        'source-arrow-color': 'data(faveColor)',
        'target-arrow-color': 'data(faveColor)'
      })
    .selector('edge.questionable')
      .css({
        'line-style': 'dotted',
        'target-arrow-shape': 'diamond'
      })
    .selector('.faded')
      .css({
        'opacity': 0.25,
        'text-opacity': 0
      }),
  
  elements: {
    nodes: [
      { data: { id: 'j', name: 'LOG515', weight: 45, faveColor: '#33334C', faveShape: 'rectangle' }, renderedPosition: { x: 300, y: 250 },locked:true },
      { data: { id: 'e', name: 'MAT150', weight: 45, faveColor: '#33334C', faveShape: 'rectangle' }, renderedPosition: { x: 100, y: 100 },locked:true },
      { data: { id: 'k', name: 'PHY150', weight: 45, faveColor: '#33334C', faveShape: 'rectangle' }, renderedPosition: { x: 100, y: 150 },locked:true },
      { data: { id: 'g', name: 'COM101', weight: 45, faveColor: '#33334C', faveShape: 'rectangle' }, renderedPosition: { x: 100, y: 200 },locked:true },
      { data: { id: 'h', name: 'PHY330', weight: 45, faveColor: '#33334C', faveShape: 'rectangle' }, renderedPosition: { x: 200, y: 150 },locked:true },
      { data: { id: 'l', name: 'LOG240', weight: 45, faveColor: '#33334C', faveShape: 'rectangle' }, renderedPosition: { x: 100, y: 250 },locked:true },
      { data: { id: 'm', name: 'LOG330', weight: 45, faveColor: '#33334C', faveShape: 'rectangle' }, renderedPosition: { x: 200, y: 250 },locked:true },
    ],
    edges: [
      { data: { source: 'k', target: 'h', faveColor: '#33334C', strength: 20 } },
      { data: { source: 'l', target: 'm', faveColor: '#33334C', strength: 50 } },
      { data: { source: 'm', target: 'j', faveColor: '#33334C', strength: 40 } }
    ]
  },
  
  ready: function(){
    window.cy = this;
    
    // giddy up
  }
});

}); // on dom ready
