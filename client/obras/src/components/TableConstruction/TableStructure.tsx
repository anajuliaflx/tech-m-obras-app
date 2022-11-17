import * as React from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import ActionsButton from '../ActionsButton';

export default function TableStructure({ style, data }: { style: string, data: any[] }) {
  return (
    <TableContainer className={style} component={Paper}>
      <Table sx={{ minWidth: 650 }} aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell><b>Nome</b></TableCell>
            <TableCell align="center"><b>Ano</b></TableCell>
            <TableCell align="center"><b>Cordenação</b></TableCell>
            <TableCell align="center"><b>Gerencia</b></TableCell>
            <TableCell align="center"><b>Diretoria</b></TableCell>
            <TableCell align="center"><b>Outorga</b></TableCell>
            <TableCell align="center"><b>Titularidade</b></TableCell>
            <TableCell align="center"><b>Ação</b></TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {data.map((row) => (
            <TableRow
              key={row.nome}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell component="th" scope="row">
                {row.nome}
              </TableCell>
              <TableCell variant='body' align="right">{row.anoCostrucao}</TableCell>
              <TableCell align="center">{row.coordenacao}</TableCell>
              <TableCell align="center">{row.gerencia}</TableCell>
              <TableCell align="center">{row.diretoria}</TableCell>
              <TableCell align="center">{row.outorga}</TableCell>
              <TableCell align="center">{row.titularidade}</TableCell>
              <TableCell align="center"><ActionsButton /></TableCell>
            </TableRow>
       ))}
        </TableBody>
      </Table>
    </TableContainer>

  );
}